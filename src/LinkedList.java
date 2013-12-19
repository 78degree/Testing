class Elemen {

    String isi;
    String path;
    Elemen next;
    Elemen prev;
    
    }


public class LinkedList {

    Elemen first, last;

    public LinkedList () {
        first = null;
        last = null;
    }

    boolean isEmpty() {
        return (first == null && last == null);
    }

    void insertFirst(String isi, String path) {
        Elemen data = new Elemen ();
        data.isi = isi ;
        data.path = path ;
        
        if (isEmpty()) {
            last = data;
        } else {
            first.prev = data;
        }
        data.next = first;
        first = data;
        
    }

    void insertLast(String isi, String path) {
        Elemen data = new Elemen ();
        data.isi = isi ;
        data.path = path ;
        
        if (isEmpty()) {
            first = data;
        } else {
            last.next = data;
        }
        data.prev = last;
        last = data;
    }
    
    void caripathnya (String cari){
        Elemen tmp = first ;
        
        while ( tmp != null){
            if ( tmp.isi.contains(cari) ){
                  
                System.out.println();
                System.out.println("words found " + tmp.isi+ " at " + tmp.path);
                
            }
            
            tmp =tmp.next;
        }
        
    }
 
    void BacaDariDepan() {
        Elemen tmp = first;
        while (tmp != null) {
            System.out.println(tmp.isi);
            //System.out.println(tmp.path);
            tmp = tmp.next;
        }
    }
}


