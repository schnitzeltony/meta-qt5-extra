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

SRC_URI[md5sum] = "6be64402f7f11a146229b6ecee96007c"
SRC_URI[sha256sum] = "b08b91f884f1542a6102930ad6c97042b3927a69fd3b0224b5d2ba105e15419e"

PV = "${KF5_VERSION}"
