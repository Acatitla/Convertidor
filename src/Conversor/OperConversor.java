package Conversor;

public class OperConversor {
    public double result;
    public double inverse;
    
    //longitud
    public void kilmilla(double n1){
        result = n1 * 0.62;
        inverse = n1 * 1.6093;
    }
    public void killyard (double n1){
        result = n1 * 1093.61;
        inverse = n1 *0.00091;
    }
    public void killpie (double n1){
        result = n1 * 3280.84;
        inverse = n1 * 0.000304;
    }
    public void killpulga (double n1){
        result = n1 * 39370.08;
        inverse = n1 * 0.0000254;
    }
    
    public void metmilla (double n1){
        result = n1 * 0.000621371;
        inverse = n1 * 1609.34;
    }
    public void metyard (double n1){
        result = n1 * 1.09361;
        inverse = n1 * 0.9144;
    }
    public void metpie (double n1){
        result = n1 * 3.28084;
        inverse = n1 * 0.3048;
    }
    public void metpulga (double n1){
        result = n1 * 39.3701;
        inverse = n1 * 0.0254;
    }
    
    public void centmilla (double n1){
        result = n1 * 0.00000621371;
        inverse = n1 * 160934;
        
    }
    public void centyard (double n1){
        result = n1 * 10.9361;
        inverse = n1 * 91.44;
    }
    public void centpie (double n1){
        result = n1 * 0.0328084;
        inverse = n1 * 30.48;
    }
    public void centpulga (double n1){
        result = n1 * 0.393701;
        inverse = n1 * 2.54;
    }
    
    public void milmilla (double n1){
        result = n1 * 0.00000062137;
        inverse = n1 * 1609340;
    }
    public void milyard (double n1){
        result = n1 * 0.00109361;
        inverse = n1 * 914.4;
    }
    public void milpie (double n1){
        result = n1 * 0.00328084;
        inverse = n1 * 304.8;
    }
    public void milpulga (double n1){
        result = n1 * 0.0393701;
        inverse = n1 * 25.4;
    }
    
    //superficie
    public void kmctomilla(double n1){
        result = n1 * 0.386102;
        inverse = n1 * 2.58999;
    }
    public void kmctoacres(double n1){
        result = n1 * 247.1027206;
        inverse = n1 * 0.00404686;
    }
    public void kmctopie (double n1){
        result = n1 * 10764262.648009;
        inverse = n1 * 0.000000092903;        
    }
    public void kmctopulga(double n1){
        result = n1 * 1550003100.0062;
        inverse = n1 * 0.0000000006451;
    }
    
    public void hectomilla (double n1){
        result = n1 * 0.0038612334;
        inverse = n1 * 258.999;
    }
    public void hectoacre (double n1) {
        result = n1 * 2.471027;
        inverse = n1 * 0.404686;
    }
    public void hectopie (double n1) {
        result = n1 * 107642.62;
        inverse = n1 * 9290300;
    }
    public void hectopulga (double n1) {
        result = n1 * 15500031.000062;
        inverse = n1 * 645160000;  
    }
    
    public void metctomilla (double n1){
        result = n1 * 0.00000038612334;
        inverse = n1 * 2589990;
    }
    public void metctoacre (double n1) {
        result = n1 * 0.0002471;
        inverse = n1 * 4046.86;
    }
    public void metctopie (double n1) {
        result = n1 * 10.764262;
        inverse = n1 * 0.092903;
    }
    public void metctopulga (double n1) {
        result = n1 * 1550.003;
        inverse = n1 * 0.00064516;
    }
    
    //Volumen
    //Metro cubico, Litro, Centimetro cubico, Mililitro
    //Barril, Galon, Pinta, Onza liquida
    public void metcubbarr (double n1) {
        result = n1 * 6.2898;
        inverse = n1 * 0.15898729;
    }
    public void metcubgal (double n1) {
        result = n1 * 219.969;
        inverse = n1 * 0.0045609;
    }
    public void metcubpinta (double n1) {
        result = n1 * 1759.75;
        inverse = n1 * 0.000568261;
    }
    public void metcubonza (double n1) {
        result = n1 * 33333.333;
        inverse = n1 * 0.000033;
    }
    
    public void litbarr (double n1) {
        result = n1 * 0.00628;
        inverse = n1 * 158.9873;
    }
    public void litgal (double n1) {
        result = n1 * 0.264172;
        inverse = n1 * 3.78541;
    }
    public void litpinta (double n1) {
        result = n1 *2.113376;
        inverse = n1 * 0.47317;
    }
    public void litbonza (double n1) {
        result = n1 * 33.333;
        inverse = n1 * 0.03;
    }
    
    public void cm3barr (double n1){
        result = n1 * 0.00000628;
        inverse = n1 * 158987.3;
    }
    public void cm3gal (double n1){
        result = n1 * 0.000264;
        inverse = n1 * 3785.4117;
    }
    public void cm3pinta(double n1){
        result = n1 * 0.00211;
        inverse = n1 * 473.176473;
    }
    public void cm3onza(double n1){
        result = n1 * 0.03333;
        inverse = n1 * 30;
    }
    
    public void milibarr(double n1){
        result = n1 * 0.00000628;
        inverse = n1 * 158987.3;
    }
    public void miligal(double n1){
        result = n1 * 0.000264;
        inverse = n1 * 3785.4117;
    }
    public void milipinta(double n1){
        result = n1 * 0.00211;
        inverse = n1 * 473.176473;
    }
    public void milionza(double n1){
        result = n1 * 0.033;
        inverse = n1 * 30;
    }
    //Peso
    //Tonelada, Kiligramo, Gramo
    //Tonelada corta, Libra, Onza
    public void toneladacorta(double n1){
        result = n1 * 1.10231;
        inverse = n1 * 0.907185;
    }
    public void tonlibra(double n1){
        result = n1 * 2204.62;
        inverse = n1 * 0.000453592;
    }
    public void tononza(double n1){
        result = n1 * 35273.96;
        inverse = n1 * 0.00002835;
    }
    
    public void kgcorta(double n1){
        result = n1 * 0.0011;
        inverse = n1 * 907.185;
    }
    public void kglibra(double n1){
        result = n1 * 2.20462;
        inverse = n1 * 0.453592;
    }
    public void kgonza(double n1){
        result = n1 * 35.274;
        inverse = n1 * 0.0283495;
    }
    
    public void grcorta(double n1){
        result = n1 * 0.0000011;
        inverse = n1 * 907185;
    }
    public void grlibra(double n1){
        result = n1 * 0.0022;
        inverse = n1 * 453.592;
    }
    public void gronza(double n1){
        result = n1 * 0.035274;
        inverse = n1 * 28.3495;
    }
    //Velocidad
    //Km/s, m/s, Km/hr
    //Milla/s, Milla/h, Pies/h, Nudo
    public void kmAmillas(double n1){
        result = n1 * 0.621371;
        inverse = n1 * 1.600934;
    }
    public void kmAmillah(double n1){
        result = n1 * 2236.94;
        inverse = n1 *0.00044704 ;
    }
    public void kmApies(double n1){
        result = n1 * 11810000;
        inverse = n1 * 0.000000084666;
    }
    public void kmAnudo(double n1){
        result = n1 * 1943.84;
        inverse = n1 * 0.00051444;
    }
    
    public void msAmillas(double n1){
        result = n1 * 0.000621;
        inverse = n1 * 1609.34;
    }
    public void msAmillah(double n1){
        result = n1 * 2.23694;
        inverse = n1 * 0.44704;
    }
    public void msApies(double n1){
        result = n1 * 3.28;
        inverse = n1 * 0.3048;
    }
    public void msAnudos(double n1){
        result = n1 * 1.94;
        inverse = n1 * 0.514444;
    }
    
    public void kmhAmillas(double n1){
        result = n1 * 0.000173;
        inverse = n1 * 5793.64;
    }
    public void kmhAmillah(double n1){
        result = n1 * 0.62;
        inverse = n1 * 1.60934;
    }
    public void kmhApies(double n1){
        result = n1 * 33280.84;
        inverse = n1 * 0.0003048;
    }
    public void kmhAnudo(double n1){
        result = n1 * 0.54;
        inverse = n1 * 1.852;
    }
    
    //Temperatura
    //Celcius, Fahrenheit, Kelvin
    
    public void celfar(double n1){
        result = n1 *9/5+32;
    }
    public void celev(double n1){
        result = n1 + 273.15 ;
    }
    
    public void farcel(double n1){
        result = (n1 - 32) * 5 / 9;
    }
    public void farkev(double n1){
        result = (n1 - 32) * 5 / 9 + 273.15 ;
    }
    
    public void kevcel(double n1){
        result = n1 - 273.15 ;
    }
    public void kevfar(double n1){
        result = (n1 - 273.15) * 9/5 +32;
    }
}