package me.duck;

public abstract class ADuck {
	// ������� ӵ�з�װ�õ� �㷨��
	// ����ӿڱ��  ��̬ʵ��
	IFlyBehavior flyBehavior;
	IQuackBehavior quackBehavior;

	public abstract void display();

	public void performQuack() {
		this.quackBehavior.quack();
	}

	public void performFly() {
		this.flyBehavior.fly();
	}

	public void swim() {
		System.out.println("i'm swiming");
	}
}
