package grupodev;

import java.util.Arrays;

public class soru7 {
    /*Soru 7 - Create a 10-element list.
    Swap the 8th element with the 3rd element.
    INPUT : String[] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
    Output:  [Umit,Emin,Furkan,Kerem,Taylan,Orhan,Sinan,Kemal,Ahmet,Ali] (edited)
     */
    public static void main(String[] args) {
        String [] names={"Umit","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
        System.out.println(Arrays.toString(names));//[Umit, Emin, Kemal, Kerem, Taylan, Orhan, Sinan, Furkan, Ahmet, Ali]
    names[3]="Furkan";
    names[8]="Kemal";
        System.out.println(Arrays.toString(names));
    }
}

