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

SRC_URI[md5sum] = "f09a43aab6f6c37c285be9a1e1a5bacf"
SRC_URI[sha256sum] = "95bc65c9164b8ed8cace08be7dfdf12cc9a398a42e2b4c66852faaa1cd1f325f"

PV = "${KF5_VERSION}"
