
package model;


public class Etudiant {
    
    
 private String Matricule ;
 private String Nom ;
 private float Notemoyenne ;
 private char Sexe;
 
 
 
 
 
 
 
 
   // les constricteur
 
    public Etudiant(){}

    public Etudiant(String Matricule, String Nom, float Notemoyenne, char Sexe) {
        this.Matricule = Matricule;
        this.Nom = Nom;
        this.Notemoyenne = Notemoyenne;
        this.Sexe = Sexe;
    }
 
 
 
 
 
 
 
 //les getters and setters 

    public String getMatricule() {
        return Matricule;
    }

    public void setMatricule(String Matricule) {
        this.Matricule = Matricule;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public float getNotemoyenne() {
        return Notemoyenne;
    }

    public void setNotemoyenne(float Notemoyenne) {
        this.Notemoyenne = Notemoyenne;
    }

    public char getSexe() {
        return Sexe;
    }

    public void setSexe(char Sexe) {
        this.Sexe = Sexe;
    }
 
 
 
 
 
}
                    