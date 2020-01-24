/**
 * 
 */
package sd.wahbi.service;

import sd.wahbi.dto.CommonRequest;
import sd.wahbi.dto.CommonResponse;
import sd.wahbi.dto.ListResponse;

/**
 * @author ahmedozy
 *
 */
public interface UnitService {

	public ListResponse getAllUnits();
	public CommonResponse saveUnit(CommonRequest request);
	public CommonResponse updateUnit(CommonRequest request);
	public CommonResponse deleteUnit(CommonRequest request);
}
