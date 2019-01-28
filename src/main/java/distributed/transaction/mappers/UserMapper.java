package distributed.transaction.mappers;

import distributed.transaction.model.User;

/**
 * @author ChengShuangYin
 */
public interface UserMapper {

	void save(User user);
}
