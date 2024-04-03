package hello.core.member.order;

public class Order {
    private Long memberId;
    private String itemName;
    private int itemPrice;
    private int discoutPrice;

    public Order(Long memberId, String itemName, int itemPrice, int discoutPrice) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.discoutPrice = discoutPrice;
    }

    public int calculatePrice() {
        return itemPrice - discoutPrice;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getDiscoutPrice() {
        return discoutPrice;
    }

    public void setDiscoutPrice(int discoutPrice) {
        this.discoutPrice = discoutPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", itemPrice=" + itemPrice +
                ", discoutPrice=" + discoutPrice +
                '}';
    }
}
