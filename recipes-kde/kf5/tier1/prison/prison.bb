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

SRC_URI[md5sum] = "95cb43eb20e081db51709b0ab6bcfa96"
SRC_URI[sha256sum] = "5a4c96209cc9845b5882475048d7012012902b3b26469f7073c4afaf5e915861"

PV = "${KF5_VERSION}"
