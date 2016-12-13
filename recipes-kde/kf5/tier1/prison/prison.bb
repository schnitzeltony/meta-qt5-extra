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

SRC_URI[md5sum] = "920bbca4760a476c289c1fbf918af103"
SRC_URI[sha256sum] = "f4e4d5badd8bbefb0e78f27640d80453e475a710a866339dd165c2dec37c8741"

PV = "${KF5_VERSION}"
