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

SRC_URI[md5sum] = "73fe712d4c110cbd2c5117d3b7a8c213"
SRC_URI[sha256sum] = "0cabcb4bea129de67f0e1f9d4f7973c34067e6e6b56b95a11d9917fafa901305"

PV = "${KF5_VERSION}"
