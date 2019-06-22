package com.cg.in;

public abstract class Item {
                  private int Id;
                  private String title;
                  private int nocopies;
                  public Item() {
					// TODO Auto-generated constructor stub
				}
				public Item(int id, String title, int nocopies) {
					super();
					Id = id;
					this.title = title;
					this.nocopies = nocopies;
				}
				public int getId() {
					return Id;
				}
				public void setId(int id) {
					Id = id;
				}
				public String getTitle() {
					return title;
				}
				public void setTitle(String title) {
					this.title = title;
				}
				public int getNocopies() {
					return nocopies;
				}
				public void setNocopies(int nocopies) {
					this.nocopies = nocopies;
				}
				@Override
				public String toString() {
					return "Item [Id=" + Id + ", title=" + title + ", nocopies=" + nocopies + "]";
				}
}
