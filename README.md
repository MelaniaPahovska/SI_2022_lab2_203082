# Меланиа Пашовска 203082

# Control Flow Graph:

![graf za u lab konecen](https://user-images.githubusercontent.com/100589854/171842905-fd2080ba-fd1b-4928-a30a-bb76caa2712f.png)


# Цикломатска комплексност:
Цикломатска комплексност број на ребра - број на јазли + 2 = 31-24+2 = 9
Доколку ги изброиме регионите исто така добиваме 9.

# Тест случаи според критериумот Every statement:
 @Test       
    void EveryStatement (){  
        IllegalArgumentException ex;      
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(Collections.EMPTY_LIST));    
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));    
        //System.out.println("Test za empty list"); test 1.1    
        ex =assertThrows(IllegalArgumentException.class, () -> SILab2.function(Arrays.asList("mel", "#", "pasovska")));    
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));   
       // System.out.println("Test za not perfect square"); test 1.2    
        assertEquals(Arrays.asList("#", "2", "0", "3", "#", "2", "#", "3", "#"), SILab2.function(Arrays.asList("#", "0", "0", "0", "#", "0", "#", "0", "#")));     
         // test 3 every statement test 1.3   
    }      
# Тест случаи според критериумот Every branch:

   @Test       
    void  EveryBranch(){          
        IllegalArgumentException ex;        
        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(Collections.emptyList()));     
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));     
        // test 2.1     
        ex =assertThrows(IllegalArgumentException.class, () -> SILab2.function(Arrays.asList("mel", "#", "pasovska")));               assertTrue(ex.getMessage().contains("List length should be a perfect square"));      
        //test 2.2    
        assertEquals(Arrays.asList("#", "2", "0", "3", "#", "2", "#", "3", "#"), SILab2.function(Arrays.asList("#", "0", "0", "0", "#", "0", "#", "0", "#")));       
        //test 2.3   
    }     

# Објаснување на напишаните unit tests:
Every statement 

Во првиот дел од тестот (test 1.1) пратив аргумент - празна листа со што тестот беше успешен бидејќи како очекуваното фрли exception(IllegalArgumentException) и ги измина јазлите 1, 2 и 3 и 23
Во вториот дел од тестот (test 1.2) како вредности на листата пратив невалидни стрингови list={"mel", "#", "pasovska"} при кој програмата не би функционирала правилно ( и бројот на елемнтите на листата беше 3 што доведе програмата да фрли ислучок исто како очекуваното во овој тест програмата ги и измина јазлите 1, 2, 45, 6, 7 и 23.
Во третиот дел од тестот (test 1.3) како вредности на листата кои се бараат да се пратат како аргумент ги одбрав list = {"#", "0", "0", "0", "#", "0", "#", "0", "#"} при што овој тест помина правилно и се доби очекуваниот резулатат односно функцијата врати листа со вредности list ={"#", "2", "0", "3", "#", "2", "#", "3", "#"} односно правилно ги изброи и изгенерира бројот и местата на бомбите како што стои во кодот. Во овој пример тест програмата ги измина јазлите 1,2,4 5,6,8, 9.0, 9.1, 9.2, 10, 11 ,12 ,13,14,15,16,17,18,19,20,21,22,23.

Every branch

Во првиот тест (test 2.1) со пратениот аргумент празна листа програмата ги измина следниве branches 1 - 2, 2 - 3, 3 - 23. Во јазолот 3 се фрла исклучок и програмат терминира.
Во вториот тест (test 2.2) како аргумент ја пратив листата list={"mel", "#", "pasovska"} со која програмата ги измина branches 1 - 2, 2 - 45, 45 - 6, 6 - 7. Во јазолот 7 програмата фрла исклучок како очекуваното и терминира.
Со третиот дел од тестот ги поминав сите останати branches кој се можни во дадената програма (1 - 2, 2 - 45, 45 - 6, 6 - 8, 8 - 9.0, 9.0 - 9.1, 9.1 - 10, 10 - 21,
21 - 9.2, 9.2 - 9.1, 10 - 11, 11 - 12, 12 - 13, 13 - 14, 13 - 15, 12 - 16, 14 - 16, 15 - 16, 16 - 18, 16 - 17, 18 - 20, 18 - 19, 17 - 18, 19 - 20, 20 - 9.2, 9.2 - 22, 22 - 23) и овој тест помина правилно. 
Сето ова го отркрив анализирајќи и дебагирајќи го дадениот код.
