package distributed.transaction.mappers;

import distributed.transaction.model.EventProcess;

/**
 * @author ChengShuangYin
 */
public interface EventProcessMapper {
	void save(EventProcess eventProcess);
}
