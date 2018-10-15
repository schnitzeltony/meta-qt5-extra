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

SRC_URI[md5sum] = "85298e953f8aff40f91c56ba93595e3d"
SRC_URI[sha256sum] = "56419afb54acdc63f6d5624d66b10852820302002a7431323dac7a23e4fca2ce"

PV = "${KF5_VERSION}"
