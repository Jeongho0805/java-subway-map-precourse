package subway.service;

import subway.domain.Section;
import subway.repository.SectionRepository;
import subway.type.TotalPrintMenu;
import subway.view.output.TotalPrintOutput;

import java.util.List;
import java.util.Scanner;

public class TotalPrintService {

    public static void printTotalSubwayList() {
        List<Section> sections = SectionRepository.sections();
        TotalPrintOutput.printTotalSubwayList(sections);
    }
}
