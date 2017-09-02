package dps.iterator;

import java.util.ArrayList;

public class PancakeHouseMenu {

	ArrayList<MenuItem> menuItems;

	public PancakeHouseMenu() {
		this.menuItems = new ArrayList();
		addItem("K&B ������ũ ��Ʈ", "��ũ������ ���׿� �佺Ʈ�� ��鿩�� ������ũ", true, 2.99);
		addItem("���ַ� ������ũ ��Ʈ", "�ް� �Ķ��̿� �ҽ����� ��鿩�� ������ũ", false, 2.99);
		addItem("���纣�� ������ũ", "�ż��� ���纣���� ���纣�� �÷����� ���� ������ũ", true, 3.49);
		addItem("����", "����, ���⿡ ���� ���纣���� ���⸦ ���� �� �ֽ��ϴ�.", true, 3.59);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}

	public ArrayList<MenuItem> getMenuItems() {
		return menuItems;
	}

	// ��Ÿ �޼ҵ�

}