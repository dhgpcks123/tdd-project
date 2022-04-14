package tpp.tddproject.inwoo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tpp.tddproject.domain.entity.nu.NuOrder;
import tpp.tddproject.inwoo.dto.ResponseDataDto;
import tpp.tddproject.inwoo.service.NuOrderService;
import tpp.tddproject.inwoo.service.ResponseService;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class NuOrderController {

    private final NuOrderService nuOrderService;
    private final ResponseService responseService;

    /**
     * 테스트 완료 후 삭제
     */
    @GetMapping("/test")
    public void test() {
        nuOrderService.test();
    }

    @GetMapping("/")
    public List<NuOrder> getNuOrderList() {
        return nuOrderService.getNuOrderList();
    }

    @GetMapping("/{nuOrderNo}")
    public Optional<NuOrder> getNuOrder(@PathVariable Long nuOrderNo) {
        return nuOrderService.getNuOrder(nuOrderNo);
    }

    @PostMapping("/{nuOrderNo}}")
    public void saveNuOrder(@PathVariable Long nuOrderNo, @RequestBody NuOrder nuOrder) {
        nuOrderService.saveNuOrder(nuOrder);
    }

    @PutMapping("/{nuOrderNo}}")
    public void updateNuOrder(@PathVariable Long nuOrderNo, @RequestBody NuOrder nuOrder) {
        nuOrderService.saveNuOrder(nuOrder);
    }

    @DeleteMapping("/{nuOrderNo}}")
    public void deleteNuOrder(@PathVariable Long nuOrderNo) {
        nuOrderService.deleteNuOrder(nuOrderNo);
    }

}
