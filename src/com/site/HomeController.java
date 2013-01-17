package com.site;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="home")
@RequestScoped
public class HomeController {

	
	private List<HomeForm> banners;
	
	public HomeController(){
		banners = new ArrayList<HomeForm>();
		populateBanners(banners, 3);
	}
	
	private void populateBanners(List<HomeForm> list, int size){
		for(int i =0; i< size;i++){
			list.add(new HomeForm("Titulo " + i ,"Descricao " + i ,"Link " + i ));
		}
	}

	public List<HomeForm> getBanners() {
		return banners;
	}

	public void setBanners(List<HomeForm> banners) {
		this.banners = banners;
	}

	
}
