/*
 * Please solve the following puzzle which simulates generic directory structures.
 * The solution should be directory agnostic.
 * Be succinct yet readable. You should not exceed more than 200 lines.
 * Consider adding comments and asserts to help the understanding.
 * Code can be compiled with javac Directory.java
 * Code should be executed as: java -ea Directory (-ea option it's to enabled the assert)
 */

class Shell {
    String Dir_path="/";
    String temp= Dir_path;
    String final_path="";                                                     //Storing updated pwd after every cd operation
    Shell cd(final String path) {
        // For checking duplicate slashes and converting them to single slashes
        if(path.matches("^.\\/+[a-z0-9\\./]+")) {                       //This regular expression findes out any path with multiple unwanted slashes
            String default_path = "/";
            for(int i=0;i<=path.length()-1;i++)                          // Removal of duplicates slashes and to convert into single slashes
            {
                if(default_path.charAt(default_path.length()-1)!='/'|| path.charAt(i)!='/')
                {
                    default_path = default_path+path.charAt(i);
                }
            }
            Dir_path = default_path.concat("@");
        }
        else if(!path.equals("/")) {
            Dir_path = Dir_path.concat(path).concat("@");               //Appending @ symbol for every cd so to avoid confusion between slashes becuase I am apending every cd operation to previous one
        }
        else if(path.equals("/"))                                       //If you just call "cd /" at any moment it reset the path.
            Dir_path = temp;
        this.path();                                                    //calling path method
        return this;
    }

    public String path() {
        // for cd "/.."
        if(Dir_path.contains("/..")) {
            String temp = Dir_path;
            Dir_path="";
            boolean check= false;
            temp=temp.replace("/..@","");                 // Removing /.. cd operation to empty string and calculating resulting path
            for(int i=temp.length()-1;i>=0;i--) {
                char c = temp.charAt(i);
                if(c=='/')                                              //For retrieving previous directory in reverse order
                    check = true;
                if(check) {
                    Dir_path = Dir_path+c;
                }
            }
            Dir_path = reverse(Dir_path);                               //For reversing the Directory path to correct order
        }
        // for cd "/.."
        if(Dir_path.contains("../")) {
            String sp[] = Dir_path.split("@../");                   //Splitting at @../ into two parts
            Dir_path="";
            boolean check=false;
            String sp1 = sp[0];
            String sp2 = sp[1];
            for(int i = sp1.length()-1;i>=0;i--) {
                char c = sp1.charAt(i);
                if(c=='@')
                    check = true;
                if(check)
                    Dir_path = Dir_path+c;
            }
            Dir_path = reverse(Dir_path).concat(sp2);                   //For reversing the Directory path to correct order and adding path to be traversed
        }
        //For cd ./ method:- This method is used for get relative path from present directory.
        if(Dir_path.contains("./")) {
            String sp[] = Dir_path.split("./");
            String sp1 = sp[0];
            String sp2 = sp[1];
            boolean check= false;
            String temp = Dir_path;
            if(sp2.length()!=1) {
                Dir_path="";
                for(int i=temp.length()-2;i>=0;i--) {
                    char c = temp.charAt(i);
                    if(c=='@')
                        check = true;
                    if(check) {
                        Dir_path = Dir_path + c;
                    }
                }
                Dir_path = Dir_path.concat(sp2);
            }
            else
                Dir_path = sp1;
        }
        //For cd .. method :- This method is used for traverse to previous directory from presert directory.
        if(Dir_path.contains("..")) {
            String sp[] = Dir_path.split("@..@");
            Dir_path="";
            boolean check=false;
            String sp1 = sp[0];
            // breaking path to characters in reverse order until checkpoint @ and eliminating rest of the path
            for(int i = sp1.length()-1;i>=0;i--) {
                char c = sp1.charAt(i);
                if(check) {
                    Dir_path = Dir_path+c;
                }
                if(c=='@')
                    check = true;
            }
            Dir_path = reverse(Dir_path);
        }
        //Here as per my logic I appended "/" at the end for convenience so I replacing it with empty string before returning along with @ is replaced with / .
        final_path = Dir_path.replace("@","/");
        //Removal of / towards the end of the path because it is not shown in PWD
        while(final_path.charAt(final_path.length()-1)=='/'&& final_path.length()>1) {
            final_path = final_path.substring(0,final_path.length()-1);
        }
        System.out.println("Present Working Directory : "+final_path);
        return final_path;
    }
//This method is specifically used for reversing the string.
    public String reverse(String str) {
        String reversed_string = "";
        for ( int i = str.length() - 1 ; i >= 0 ; i-- )
            reversed_string = reversed_string + str.charAt(i);
        return reversed_string;
    }
}

public class Directory {
    public static void main(String[] args) {
        final Shell shell = new Shell();
        assert shell.path().equals("/");

        shell.cd("/");
        assert shell.path().equals("/");

        shell.cd("usr/..");
        assert shell.path().equals("/");

        shell.cd("usr").cd("local");
        shell.cd("../local").cd("./");
        assert shell.path().equals("/usr/local");

        shell.cd("..");
        assert shell.path().equals("/usr");

        shell.cd("//lib///");
        assert shell.path().equals("/lib");

    }
}

