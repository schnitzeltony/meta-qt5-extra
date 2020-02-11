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

SRC_URI[md5sum] = "181d901dbda09ee7d26fd234eef56ed4"
SRC_URI[sha256sum] = "ae3d9acd0b7bb469f1597e8e453ba8a056f2fdc2450a5ed332c29a19bcefec5d"

PV = "${KF5_VERSION}"
