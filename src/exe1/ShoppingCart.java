package exe1;

import java.util.ArrayList;

public class ShoppingCart {
    private int id;
    private ArrayList<CarItem> carItens; // vetor

    public ShoppingCart() {
        // Alocar espaço para o vetor
        carItens = new ArrayList<CarItem>();
    }

    public ShoppingCart(int id, ArrayList<CarItem> carItens) {
        this.id = id;
        this.carItens = carItens;
    }

    // Adiciona um carTiem no vetor 
    public void addCarItem(CarItem carItem){
        this.carItens.add(carItem);
    }

    // Remove um item do carrinho
    public boolean removeCarItem(CarItem carItem){
        return this.carItens.remove(carItem);
    }

    public int getId() {
        return id;
    }

    public final void setId(int id) {
        this.id = id;
    }

    public ArrayList<CarItem> getCarItens() {
        return carItens;
    }

    public final void setCarItens(ArrayList<CarItem> carItens) {
        this.carItens = carItens;
    }

    
}
