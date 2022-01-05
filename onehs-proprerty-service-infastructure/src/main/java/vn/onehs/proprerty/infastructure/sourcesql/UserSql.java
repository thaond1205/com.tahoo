package vn.onehs.proprerty.infastructure.sourcesql;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "users")
public class UserSql {

	public UserSql(String username, String email, String password) {
		this.username = username;
		this.email = email;
		this.password = password;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String first_name;
	private String last_name;
	private String phone;
	private String email;

	@Temporal(TemporalType.DATE)
	private Date date_of_birth;
	private String address;
	private Integer enabled;
	private String image;
	private Integer sex;
	private Integer status;
	private String username;
	private String password;
	private String cccd;
	
	@ManyToMany
	@JoinTable(	name = "user_roles", 
				joinColumns = @JoinColumn(name = "user_id"), 
				inverseJoinColumns = @JoinColumn(name = "role_id"))
	private Set<RoleSql> roles = new HashSet<>();

	private Integer id_creator;

}
