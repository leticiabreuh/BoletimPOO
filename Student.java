public class Student{
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public String message(){
        return  "Aluno "+name+"\n"+ 
                "Primeira nota "+grade1+"\n"+
                "Segunda nota "+grade2+"\n"+
                "Terceira nota "+grade3;

    }
    
    //notal final
    public double finalGrade(){
        return grade1+ grade2+grade3;
        

    }
    //quantos falta para passar
    public double missingPoints(){
        return  60 - finalGrade() ;
    }
    
    public String checking(){
        if(finalGrade() < 60){
            return "FAILED, FINAL GRADE:"+finalGrade()+" | Missing:"+missingPoints()+"Points";


        } else{
             return "PASS, FINAL GRADE:"+finalGrade();
        }

        scanner.close();
       
    }
}