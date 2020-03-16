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

SRC_URI[md5sum] = "8fdeac36b4eb9202dde6f7390d46d9da"
SRC_URI[sha256sum] = "22e2b8e9ca06e4fb7ab91afeddbaebe6e2b6792bbcd5ba6c440c6fad0df176b7"

PV = "${KF5_VERSION}"
