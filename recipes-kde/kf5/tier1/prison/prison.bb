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

SRC_URI[md5sum] = "e6aa01e4a900a843391a79e557b874f3"
SRC_URI[sha256sum] = "dc5020918f0b18f4e527df19302d7a58c82a51a5f611cec2bb14e8fe16ac4610"

PV = "${KF5_VERSION}"
