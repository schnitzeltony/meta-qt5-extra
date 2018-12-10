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

SRC_URI[md5sum] = "49f35779816680e7da357abba972ceb0"
SRC_URI[sha256sum] = "61b5f10b48d847ce60769d10525a8f4c3c7120d71dd8e2e6285d303ea519b579"

PV = "${KF5_VERSION}"
