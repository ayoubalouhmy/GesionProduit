package com.example.entity.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "produit")
public class Produit {    
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private int id;
    @Column(name = "nom")
    private String name;
    @Column (name = "prix")
    private double prix;
    @Column(name = "quantiter")
    private double quantiter;
    public Produit(String nom , double prix , double quantiter){
        this.name =nom;
        this.prix = prix;
        this.quantiter = quantiter;
    };
    //Getters
    public String getName() {return name;}
    public double getPrix() { return prix;}
    public double getQuantiter(){return quantiter;}
    //Setters
    void SetName(String name) { this.name = name;}
    void setPrix(double prix){  this.prix = prix;}
    void setQuantiter(double quantiter){  this.quantiter = quantiter;}
    @Override
    public String toString(){
         return "nom " + name + "\nPrix : " + prix +"" +
                            "\nQuantités : " + quantiter;
    };

}
