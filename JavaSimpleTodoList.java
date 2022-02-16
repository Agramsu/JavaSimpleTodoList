import java.util.Scanner;

public class JavaSimpleTodoList {
    public static final Integer tetap = 1000;
    public static String[] todolist = new String[tetap];
    public static Integer counter = 0;

    public static void main(String[] args) {
        InputTodo();
    }

    static void InputTodo()
    {
        Scanner scan = new Scanner(System.in);
        String input;

        for(Integer a = 0; a < todolist.length; a++)
        {
            System.out.print("\tTodo\t: ");
            input = scan.nextLine();
            if(input == "")
            {
                break;
            } else{}
            todolist[counter] = input;
            counter++;
            break;
        }
        Menampilkan_Todo();
    }

    static void Menampilkan_Todo()
    {
        Scanner scan = new Scanner(System.in);

        for(Integer b = 0; b < counter; b++)
        {
            System.out.println( "\t"+ (b+1) + ".\t" + todolist[b]);
        }
        Integer c;
        System.out.println("\n\tSilahkan Pilih !!!");
        System.out.println("1. Input Todo");
        System.out.println("2. Hapus Todo");
        System.out.println("3. Akhiri Program");
        c = scan.nextInt();
        switch(c)
        {
            case 1 :
                InputTodo();
                break;
            case 2 :
                Hapus_Todo();
                break;
            case 3 :
                ProgramSelesai();
                break;
            default :
                Menampilkan_Todo();
                break;
        }

    }

    static void Hapus_Todo()
    {
        Scanner scan = new Scanner(System.in);
        Integer hapus;
        System.out.println();
        System.out.print("Hapus\t: ");
        hapus = scan.nextInt();
        for(Integer d = 0; d < counter; d++)
        // Jika e looping dan sampai pada tahap sama dengan hapus-1
        // maka langsung pindah ke decision dan looping lagi
        {
            if((hapus-1) == d)
            {
                // tapi nilai f akan mengambil nilai terakhir e waktu looping
                // contoh : hapus menyimpan nilai 2 sehingga 2 - 1 sama dengan 1
                // jika looping e sama dengan satu maka masuk ke decision dan looping lagi
                // Namun nilai f akan dimulai dengan nilai terakhir looping e yaitu 1
                // sehingga akan terjadi looping subtitusi nilai
                for(Integer e = d; e < counter; e++)
                {
                    todolist[(e)] = todolist[e+1];
                }
            }
        }
        counter--;
        Menampilkan_Todo();
    }

    static void ProgramSelesai()
    {
        System.exit(0);
    }






}



