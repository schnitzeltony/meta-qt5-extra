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

SRC_URI[md5sum] = "b34f81e5af793dfde9943e4eaf9969a8"
SRC_URI[sha256sum] = "1dbe7531d1ebe6adcef6b56553812ae6557d32c3a3da65be7cd7ea02be331e16"

PV = "${KF5_VERSION}"
