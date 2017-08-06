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

SRC_URI[md5sum] = "7b3ce37421da15aa824ba67df5029b7d"
SRC_URI[sha256sum] = "e3832e77904fbec6a18453f55ab03e93d3ced76ba78c7ada6919a8b76b7da238"

PV = "${KF5_VERSION}"
