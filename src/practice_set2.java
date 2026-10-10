class methods_name_practice {
    public static void main(String[] args) {
        String str = "my name is a mahi ";
        int count = 0;
        String[] arr = str.split(" ");
        for (String e : arr) {
            count++;
        }
        System.out.println(count);
    }
}
        //String str="hello";
//        int count=0;
//        for(int i=0; i<str.length(); i++){
//            char ch = str.charAt(i);
//            count++;
//        }
//        System.out.println(count);
//    }
//        String s = "hello162";
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if (ch >= '0' && ch <= '9') {
//                count++;
//            }
//        }
//        if (count == 2) {
//            System.out.println("contains two digits character");
//        } else {
//            System.out.println("doesn't contains exactly two character");
//        }
//    }
//}
//        String str = "mahi  vaish cse";
//        System.out.println(str.replace(" ",""));
//        String result= "";
//        for(int i=0; i<str.length(); i++) {
//            char ch = str.charAt(i);
//            if (ch != ' ') {
//                result = result + ch;
//            }
//
//        }System.out.println(result);
//    }
//    }
//        String str = "hello world";
//        //char ch= 'l';
//        for (int i = 0; i < str.length(); i++) {
//            int count = 1;
//            for (int j = i+1; j < str.length(); j++) {
//                if (str.charAt(i) == str.charAt(j)) {
//                    count++;
//                }
//            }
//            System.out.println("count=" + count);
//        }
//    }
//}
//        String str = "neha";
//        String upper="";
//        for(int i=0; i<str.length(); i++) {
//            char ch = str.charAt(i);
//            if (ch >= 'a' && ch <= 'z') {
//                ch = (char) (ch - 32);
//            }
//            upper = upper + ch;
//        }
//            System.out.println(upper);
//    }
//    }
//        String s = "My name is mahi!! ";
//          int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            char ch = s.charAt(i);
//            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
//                System.out.print(ch);
//                count++;
//
//            }
//        }
//        System.out.println(count);
//            }
//    }
//        String s = "neha";
//        System.out.println(s);
//        int count = 0;
//        String st = "neha";
//        for (char ch : st.toCharArray()) {
//            count++;
//        }
//        System.out.println(count);
//        String str = "neha";
//        int cnt = 0;
//        for (int i = 0; i < s.length(); i++) {
//            char ch = str.charAt(i);
//            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
//                System.out.println(ch + " ");
//                cnt++;
//            }
//        }
//        System.out.println("vowels = " + cnt);
//        String a = "neha";
//        String rev = " ";
//        for (int i = a.length() - 1; i >= 0; i--) {
//            rev = rev + a.charAt(i);
//
//        }
//        System.out.println(rev);
//
//        String x = "racecar";
//        String reverse = "";
//        for (int i = x.length()-1; i >= 0; i--) {
//            reverse += x.charAt(i);
//        }
//        System.out.println(reverse);
//        if (x.equalsIgnoreCase(reverse)) {
//            System.out.println("yes, it is a palindrome ");
//        } else {
//            System.out.println("no, it is not a palindrome ");
//        }
//    }
//}
//        String s = "  My name     is neha  ";
//        String p = " MY, NAME, IS, NEHA ";
//        System.out.println(s.length());
//        System.out.println(s.charAt(3));
//        System.out.println(s.substring(3));
//        System.out.println(s.substring(3,7));
//        System.out.println(s.contains("My"));
//        System.out.println(s.contains("mahi"));
//        System.out.println(s.equals("neha"));
//        System.out.println(s.equals("My name is neha "));
//        System.out.println(s.equalsIgnoreCase(p));
//        System.out.println(s.toUpperCase());
//        System.out.println(p.toLowerCase());
//        System.out.println(s.trim());
//        String str = "mahi vaish Cse";
//        String [] arr= str.split(" ");
//        for(String e: arr){
//            System.out.println(e);
//            System.out.println(str.startsWith("ma"));
//            System.out.println(str.endsWith("ma"));
//            System.out.println(str.valueOf(str));
//            String n="love";
//            char [] ar =n.toCharArray();
//            for(char ch :ar){
//                System.out.println(ch);
//            }
//            String x=" ";
//            System.out.println(x.isEmpty());
//            System.out.println(x.isBlank());
//            String a="I am neha";
//            String b="mahi";
//            System.out.println(a.replace("neha","mahi"));
//        }
//    }
//}