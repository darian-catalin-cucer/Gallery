package cucerdariancatalin.gallery.interfaces

import com.simplemobiletools.commons.models.FileDirItem
import cucerdariancatalin.gallery.models.ThumbnailItem

interface MediaOperationsListener {
    fun refreshItems()

    fun tryDeleteFiles(fileDirItems: ArrayList<FileDirItem>)

    fun selectedPaths(paths: ArrayList<String>)

    fun updateMediaGridDecoration(media: ArrayList<ThumbnailItem>)
}
