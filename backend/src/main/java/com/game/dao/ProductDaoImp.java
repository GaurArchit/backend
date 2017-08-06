package com.game.dao;




import java.util.List;
 
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.games.model.Product;
 

 
@Repository("productDao")
public class ProductDaoImp extends AbstractDao implements ProductDao{
 
    public void saveProduct(Product product) {
        persist(product);
    }
 
    @SuppressWarnings("unchecked")
    public List<Product> findAllProduct() {
        Criteria criteria = getSession().createCriteria(Product.class);
        return (List<Product>) criteria.list();
    }
 
    public void deleteProductById(int id) {
        Query query = getSession().createSQLQuery("delete from Product where id = :id");
        query.setInteger("id", id);
        query.executeUpdate();
    }
 
     
    public Product findProductById(int id){
        Criteria criteria = getSession().createCriteria(Product.class);
        criteria.add(Restrictions.eq("id",id));
        return (Product) criteria.uniqueResult();
    }
     
    public void updateProduct(Product product){
        getSession().update(product);
    }

	

	     
}

