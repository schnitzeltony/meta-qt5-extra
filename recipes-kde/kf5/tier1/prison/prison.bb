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

SRC_URI[md5sum] = "783a3caa416fecc9039359be9c5d9ebe"
SRC_URI[sha256sum] = "d5e579a14fc19ac21b02029e5c1ed2461358a9be7cd3319db113942ab98b8c3e"

PV = "${KF5_VERSION}"
