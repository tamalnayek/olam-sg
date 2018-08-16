package com.arith;

class ProductNotFoundException extends Exception {
	private int productId;

	public ProductNotFoundException(int productId) {
		this.productId = productId;
	}

	public String getMessage() {
		return "product-" + this.productId + " not exists";
	}
}

// data-layer  ( persisting logic )
//--------------------------------------------------------

class ProductRepository {
	public String find(int productId) throws ProductNotFoundException {
		// ..
		String product = "olam product";
		if (product == null) {
			ProductNotFoundException pne = new ProductNotFoundException(productId);
			throw pne;
		}
		return product;
	}
}

//--------------------------------------------------------

//service-layer ( processing logic )
//--------------------------------------------------------

class ProductService {
	public String doSomethingWithProduct(int productId) throws ProductNotFoundException {
		ProductRepository productRepository = new ProductRepository();
		String product = productRepository.find(productId);
		return product.toUpperCase();
	}
}

//--------------------------------------------------------

//web-layer     ( request & response logic )
//--------------------------------------------------------

class ProductController {
	public String get(int productId) {
		ProductService productService = new ProductService();
		String resp = null;
		try {
			resp = productService.doSomethingWithProduct(productId);
		} catch (ProductNotFoundException e) {
			resp = e.getMessage();
		}
		return resp;
	}
}

//--------------------------------------------------------

public class Checked_Unchecked_Ex {

	public static void main(String[] args) {

		ProductController productController = new ProductController();
		String out = productController.get(123);
		System.out.println(out);

	}

}
