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

SRC_URI[md5sum] = "4e1c827bc723d90312d7108e25405df0"
SRC_URI[sha256sum] = "8dd4400817b4863597eb87fafce27f6cb11ad8a1f4da7491e4c9e4dcaa2fdff1"

PV = "${KF5_VERSION}"
