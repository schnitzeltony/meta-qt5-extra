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

SRC_URI[md5sum] = "179e9c8572d45c1c4fa1c22d3329aa6e"
SRC_URI[sha256sum] = "646d3cdffa5dbf679b1765858dfaa1fb173e6c9b1d05c1ae156da4b2f68ed4e1"

PV = "${KF5_VERSION}"
