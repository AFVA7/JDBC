package com.alura.jdbc.controller;

import java.util.List;

import com.alura.jdbc.DAO.CategoriaDAO;
import com.alura.jdbc.factory.ConnectionFactory;
import com.alura.jdbc.modelo.Categoria;

public class CategoriaController {

	CategoriaDAO categoriaDAO;

	public CategoriaController() {
		categoriaDAO = new CategoriaDAO(new ConnectionFactory().recuperaConexión());
	}

	public List<Categoria> listar() {
		return categoriaDAO.listar();
	}

	public List<Categoria> cargaReporte() {
		return categoriaDAO.listarConProductos();
	}

}
