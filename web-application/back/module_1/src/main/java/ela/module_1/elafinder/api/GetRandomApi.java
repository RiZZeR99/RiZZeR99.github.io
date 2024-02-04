/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.52).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package ela.module_1.elafinder.api;

import ela.module_1.elafinder.models.EsotericLanguage;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Validated
public interface GetRandomApi {

    @Operation(summary = "Random esoteric language", description = "Returns a random esoteric language, for the scenario when the user wants an esoteric language without to think too much about it", tags = {"ela"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = @Content(mediaType = "application/json", schema = @Schema(implementation = EsotericLanguage.class))),

            @ApiResponse(responseCode = "500", description = "Server error")})
    @RequestMapping(value = "/getRandom",
            produces = {"application/json"},
            method = RequestMethod.GET)
    ResponseEntity<EsotericLanguage> getRandom();

}

