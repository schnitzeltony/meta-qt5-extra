SUMMARY = "Barcode abstraction layer"
LICENSE = "MIT"
LIC_FILES_CHKSUM = " \
    file://LICENSE;md5=02744127548d68b579a51bda5af08e2b \
"

inherit kde-kf5

DEPENDS += " \
    qrencode \
    libdmtx \
"

SRC_URI[md5sum] = "c9bd6c1897c8632b7241293ea1bbb4ab"
SRC_URI[sha256sum] = "9d86dae75b8b65268207a59b6362ade0fcfc8287654746ca4a9841e8bc279203"

PV = "${KF5_VERSION}"
