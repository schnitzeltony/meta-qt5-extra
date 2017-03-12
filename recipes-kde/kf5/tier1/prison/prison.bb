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

SRC_URI[md5sum] = "1b2be7bf73adccc0cad1428aa7c9cb87"
SRC_URI[sha256sum] = "79fbc8e896583f51b1130aebfe6c77f520a8654ea343ebeba86d8d2480d1ac60"

PV = "${KF5_VERSION}"
