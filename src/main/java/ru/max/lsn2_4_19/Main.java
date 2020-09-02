package ru.max.lsn2_4_19;

/**
 * @author Serov Maxim
 */
public class Main {
    public static void main(String[] args) {
       /* Пример вывода 1:
        Городничий:
        1)Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие:к нам едет ревизор.
        4)Ревизор из Петербурга, инкогнито.И еще с секретным предписаньем.

        Аммос Федорович:
        2)Как ревизор?
        5)Вот те на !

        Артемий Филиппович:
        3)Как ревизор?
        6)Вот не было заботы, так подай !

        Лука Лукич:
        7)Господи боже !еще и с секретным предписаньем !*/

        String[] roles = new String[]{
                "Городничий",
                "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич",
                "Лука"
        };
        String[] textLines = new String[]{
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич:] [Господи боже! еще и с секретным предписаньем!",
                "Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор."
        };
        System.out.println(printTextPerRole(roles, textLines));
    }

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
//        for (int i = 0; i < textLines.length; i++) {
//            String temp = textLines[i];
//            textLines[i] = (count++) + ")" + temp ;
//            System.out.println(textLines[i].toString());
//        }

        for (String strTemp : roles) {
            sb.append(strTemp).append(":").append('\n');

            for (String textLine : textLines) {

                if (textLine.startsWith(strTemp + ":")) {

                    String temp = textLine.replaceFirst("(^" + strTemp + ":" + "[\\s\\p{Punct}]?+" + ")", "");
//                    String temp = textLine.replaceFirst("(^" + strTemp + ":" + "[\\s\\[\\]\\w]+)", "");
//                    String temp = textLine.replaceFirst(strTemp + "[\\s:\\[\\]]+", "");
                    sb.append(count++).append(")").append(temp).append('\n');
//                    count++;
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}