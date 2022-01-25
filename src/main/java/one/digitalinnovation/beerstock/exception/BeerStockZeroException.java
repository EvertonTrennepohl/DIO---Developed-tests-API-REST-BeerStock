package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockZeroException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BeerStockZeroException(Long id, int quantityToDecrement) {
        super(String.format("Beers with %s ID to decrement informed exceeds the stock: %s", id, quantityToDecrement));
    }

}