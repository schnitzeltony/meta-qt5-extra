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

SRC_URI[md5sum] = "d595c1a550df6810103a3d710fffc308"
SRC_URI[sha256sum] = "ecd68620fd0b1e609de458edd1e5e0fd20de961453794be141f5868d8ff97497"

PV = "${KF5_VERSION}"
