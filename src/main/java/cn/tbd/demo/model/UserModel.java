package cn.tbd.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import cn.tbd.common.model.AbstractModel;
import cn.tbd.common.web.validator.DateFormat;

/**
 * 
 */
@Entity
@Table(name = "tbd_user")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class UserModel extends AbstractModel {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2447503397931674350L;


	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    
    
    @Pattern(regexp = "[A-Za-z0-9]{5,20}", message = "{username.illegal}") //java validator
    private String username;
    
    @NotEmpty(message = "{email.illegal}")
    @Email(message = "{email.illegal}")
    private String email;
    
    @Pattern(regexp = "[A-Za-z0-9]{5,20}", message = "{password.illegal}") 
    private String password;
    
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UserModel other = (UserModel) obj;
        if (id != other.id)
            return false;
        return true;
    }
    
    
    
}
