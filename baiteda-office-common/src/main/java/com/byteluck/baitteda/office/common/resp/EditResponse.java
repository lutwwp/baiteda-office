package com.byteluck.baitteda.office.common.resp;

import com.byteluck.baitteda.office.common.dto.Mentions;
import com.byteluck.baitteda.office.common.model.FileModel;
import lombok.Data;

import java.util.List;

/**
 * @author wwp
 * @date 2022年03月29日 15:04
 */
@Data
public class EditResponse {
    private FileModel fileModel;
    private String[] fileHistory;
    private String docserviceApiUrl;
    private String dataInsertImage;
    private String dataCompareFile;
    private String dataMailMergeRecipients;
    private List<Mentions> usersForMentions;
}
