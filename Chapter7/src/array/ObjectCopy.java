package array;

public class ObjectCopy {

	public static void main(String[] args) {
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("�»�", "����1");
		bookArray1[1] = new Book("�»�", "����2");
		bookArray1[2] = new Book("�»�", "����3");
		
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for ( int i = 0 ; i < bookArray2.length; i ++) {
			bookArray2[i].showBookInfo();
			
		}
		bookArray1[0].setAuthor("�����");
		bookArray1[0].setBookName("������");
		
		for ( int i = 0 ; i < bookArray2.length; i ++) {
			bookArray2[i].showBookInfo();
			
		}
		
		
	  String[] strarr = {"ajava", "dads", "ads"};
	  for(String s: strarr) {
		  System.out.println(s);
	  }
 
		
	}

}
