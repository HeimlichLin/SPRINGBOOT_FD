package idv.heimlich.springboot.usecase.useraction.fetch;

import java.util.Date;

import lombok.Data;

@Data
public class FetchUserActionInputDTO {

	private String bondno;
	private Date startDate;
	private String status;

}
