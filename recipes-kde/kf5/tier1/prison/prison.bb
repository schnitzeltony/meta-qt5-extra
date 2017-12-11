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

SRC_URI[md5sum] = "c8f1ba624b752249fba8a590b9c67f4a"
SRC_URI[sha256sum] = "b1ef221964d479255ac1ded2a96b73f90723b8e69f3b3c9a86dd1f02860a7960"

PV = "${KF5_VERSION}"
