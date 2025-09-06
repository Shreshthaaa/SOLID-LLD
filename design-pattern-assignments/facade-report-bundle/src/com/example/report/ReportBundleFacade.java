package com.example.report;

import java.nio.file.Path;
import java.util.Map;

public class ReportBundleFacade {
    private final JsonWriter jsonWriter;
    private final Zipper zipper;
    private final AuditLog auditLog;

    public ReportBundleFacade(JsonWriter jsonWriter, Zipper zipper, AuditLog auditLog) {
        this.jsonWriter = jsonWriter;
        this.zipper = zipper;
        this.auditLog = auditLog;
    }

    public Path export(Map<String, Object> data, Path outDir, String baseName) {
        Path json = jsonWriter.write(data, outDir, baseName);
        Path zip = zipper.zip(json, outDir.resolve(baseName + ".zip"));
        auditLog.log("exported " + zip);

        return zip;
    }
}
