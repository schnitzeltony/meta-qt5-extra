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

SRC_URI[md5sum] = "588eec6668cf6675af7147952d5c53e7"
SRC_URI[sha256sum] = "db06431d8b8679643faedd7787495ef43154a71599949f42cb55b11ec88812ac"

PV = "${KF5_VERSION}"
