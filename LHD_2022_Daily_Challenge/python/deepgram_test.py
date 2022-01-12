from deepgram import Deepgram
import asyncio, json

# The API key you created in step 1
DEEPGRAM_API_KEY = 'cdb105f4fc2a17cbb09f8607bba03804d4aec370'

AUDIO_URL = 'https://static.deepgram.com/examples/Bueller-Life-moves-pretty-fast.wav'

async def main():
    # Initializes the Deepgram SDK
    dg_client = Deepgram(DEEPGRAM_API_KEY)
    source = {'url': AUDIO_URL}

    print('Requesting transcript...')
    print('Your file may take up to a couple minutes to process.')
    print('While you wait, did you know that Deepgram accepts over 40 audio file formats? Even MP4s.')
    print('To learn more about customizing your transcripts check out developers.deepgram.com.')

    response = await dg_client.transcription.prerecorded(source,  {'punctuate': True})
    print(json.dumps(response, indent=4))

asyncio.run(main())